


















package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 返校申请
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/fanxiao")
public class FanxiaoController {
    private static final Logger logger = LoggerFactory.getLogger(FanxiaoController.class);

    @Autowired
    private FanxiaoService fanxiaoService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private XueshengService xueshengService;

    @Autowired
    private LaoshiService laoshiService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role)){
            XueshengEntity xueshengEntity = xueshengService.selectById(String.valueOf(request.getSession().getAttribute("userId")));
            params.put("xueshengId",xueshengEntity.getId());
            params.put("banjiTypes",xueshengEntity.getBanjiTypes());
        }
        else if("老师".equals(role)){
            LaoshiEntity laoshiEntity = laoshiService.selectById(String.valueOf(request.getSession().getAttribute("userId")));
            params.put("laoshiId",laoshiEntity.getId());
            params.put("banjiTypes",laoshiEntity.getBanjiTypes());
        }
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = fanxiaoService.queryPage(params);

        //字典表数据转换
        List<FanxiaoView> list =(List<FanxiaoView>)page.getList();
        for(FanxiaoView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        FanxiaoEntity fanxiao = fanxiaoService.selectById(id);
        if(fanxiao !=null){
            //entity转view
            FanxiaoView view = new FanxiaoView();
            BeanUtils.copyProperties( fanxiao , view );//把实体数据重构到view中

                //级联表
                XueshengEntity xuesheng = xueshengService.selectById(fanxiao.getXueshengId());
                if(xuesheng != null){
                    BeanUtils.copyProperties( xuesheng , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setXueshengId(xuesheng.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody FanxiaoEntity fanxiao, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,fanxiao:{}",this.getClass().getName(),fanxiao.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role))
            return R.error(511,"权限为空");
        else if("学生".equals(role))
            fanxiao.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<FanxiaoEntity> queryWrapper = new EntityWrapper<FanxiaoEntity>()
            .eq("xuesheng_id", fanxiao.getXueshengId())
            .eq("diqu", fanxiao.getDiqu())
            .eq("fangshi_types", fanxiao.getFangshiTypes())
            .eq("checi", fanxiao.getCheci())
            .eq("fengxian_types", fanxiao.getFengxianTypes())
            .eq("fanxiao_yesno_types", fanxiao.getFanxiaoYesnoTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FanxiaoEntity fanxiaoEntity = fanxiaoService.selectOne(queryWrapper);
        if(fanxiaoEntity==null){
            fanxiao.setFanxiaoYesnoTypes(1);
            fanxiao.setInsertTime(new Date());
            fanxiao.setCreateTime(new Date());
            fanxiaoService.insert(fanxiao);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody FanxiaoEntity fanxiao, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,fanxiao:{}",this.getClass().getName(),fanxiao.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(StringUtil.isEmpty(role))
//            return R.error(511,"权限为空");
//        else if("学生".equals(role))
//            fanxiao.setXueshengId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<FanxiaoEntity> queryWrapper = new EntityWrapper<FanxiaoEntity>()
            .notIn("id",fanxiao.getId())
            .andNew()
            .eq("xuesheng_id", fanxiao.getXueshengId())
            .eq("fanxiao_time", fanxiao.getFanxiaoTime())
            .eq("diqu", fanxiao.getDiqu())
            .eq("fangshi_types", fanxiao.getFangshiTypes())
            .eq("checi", fanxiao.getCheci())
            .eq("fengxian_types", fanxiao.getFengxianTypes())
            .eq("fanxiao_yesno_types", fanxiao.getFanxiaoYesnoTypes())
            .eq("insert_time", fanxiao.getInsertTime())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FanxiaoEntity fanxiaoEntity = fanxiaoService.selectOne(queryWrapper);
        if(fanxiaoEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      fanxiao.set
            //  }
            fanxiaoService.updateById(fanxiao);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        fanxiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<FanxiaoEntity> fanxiaoList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            FanxiaoEntity fanxiaoEntity = new FanxiaoEntity();
//                            fanxiaoEntity.setXueshengId(Integer.valueOf(data.get(0)));   //学生 要改的
//                            fanxiaoEntity.setFanxiaoTime(new Date(data.get(0)));          //申请返校日期 要改的
//                            fanxiaoEntity.setDiqu(data.get(0));                    //当前地址 要改的
//                            fanxiaoEntity.setFangshiTypes(Integer.valueOf(data.get(0)));   //返校方式 要改的
//                            fanxiaoEntity.setCheci(data.get(0));                    //返校车次 要改的
//                            fanxiaoEntity.setFengxianTypes(Integer.valueOf(data.get(0)));   //所在地区风险等级 要改的
//                            fanxiaoEntity.setFanxiaoContent("");//照片
//                            fanxiaoEntity.setFanxiaoYesnoTypes(Integer.valueOf(data.get(0)));   //是否同意 要改的
//                            fanxiaoEntity.setInsertTime(date);//时间
//                            fanxiaoEntity.setCreateTime(date);//时间
                            fanxiaoList.add(fanxiaoEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        fanxiaoService.insertBatch(fanxiaoList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
