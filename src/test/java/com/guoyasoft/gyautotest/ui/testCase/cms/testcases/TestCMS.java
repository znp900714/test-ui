package com.guoyasoft.gyautotest.ui.testCase.cms.testcases;

import com.guoyasoft.gyautotest.tools.CSVReader;
import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.cms.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class TestCMS extends BaseUI {

    /*
    测试基础表格页面的编辑功能
     */
    @Test
    public void testBaseTableEdit() {
        //加载后台管理系统的主页
        CMSHomePage cmsHomePage = PageFactory.initElements(driver,CMSHomePage.class);
        //调用点击元素基础表格的方法
        cmsHomePage.clickBaseTable();
        //加载基本表格页面
        CMSBaseTablePage tablePage = PageFactory.initElements(driver,CMSBaseTablePage.class);
        //调用点击元素第一行的编辑的方法
        tablePage.clickEdit1();
        //加载基础表格编辑的页面
        CMSBaseTableEditPage editPage = PageFactory.initElements(driver,CMSBaseTableEditPage.class);
        //调用基础表格页面编辑页面的编辑方法
        editPage.edit("2018-12-24","平安夜","上海市闵行区");
        //调用基础表格页面编辑页面的获取提示弹出的信息的内容的方法
        String  text = editPage.getText();
        //控制台打印获取文本
        System.out.println(text);
        //判断获取的文本内容是否包含"修改第 1 行成功"
        boolean actual = text.contains("修改第 1 行成功");
        //断言
        Assert.assertEquals(actual,true);
    }
    
    /*
    测试基础表格页面的删除功能
     */
    @Test
    public void testBaseTableDel(){
        //加载后台管理系统的主页
        CMSHomePage cmsHomePage = PageFactory.initElements(driver,CMSHomePage.class);
        //调用点击元素基础表格的方法
        cmsHomePage.clickBaseTable();
        //加载基本表格页面
        CMSBaseTablePage tablePage = PageFactory.initElements(driver,CMSBaseTablePage.class);
        //调用点击元素第一行的删除的方法
        tablePage.clickDelete1();
        //加载基础表格删除的页面
        CMSBaseTableDeletePage deletePage = PageFactory.initElements(driver,CMSBaseTableDeletePage.class);
        //调用基础表格页面删除页面的点击删除提示框的确定按钮的方法
        deletePage.clickDelSureBtn();
        //调用基础表格页面删除页面的获取提示弹出的信息的内容的方法
        String  text = deletePage.getText();
        //控制台打印获取文本
        System.out.println(text);
        //判断获取的文本内容是否包含"修改第 1 行成功"
        boolean actual = text.contains("删除");
        //断言
        Assert.assertEquals(actual,true);
    }

    /*
    测试基础表单页面
     */
    @Test
    public void testBaseForm() {
        //加载后台管理系统的主页
        CMSHomePage cmsHomePage = PageFactory.initElements(driver,CMSHomePage.class);
        //调用点击元素表单相关的方法
        cmsHomePage.clickRelateForm();
        //调用点击元素基本表单的方法
        cmsHomePage.clickBaseForm();
        //加载基本表单页面
        CMSBaseFormPage cmsBaseFormPage = PageFactory.initElements(driver,CMSBaseFormPage.class);
        cmsBaseFormPage.sendkeysFormNameInput("guoya2018");
        sleep(1);
        cmsBaseFormPage.sendkeysSelectorInput();
        sleep(1);
        cmsBaseFormPage.sendkeysDateInput("2018-12-25");
        sleep(1);
        cmsBaseFormPage.sendkeysTimeInput("11:44:25");
        sleep(1);
        cmsBaseFormPage.sendkeysCityInput();
        sleep(5);
    }

    @Test
    public void testCustomIcons() {
        //加载后台管理系统的主页
        CMSHomePage cmsHomePage = PageFactory.initElements(driver,CMSHomePage.class);
        //调用点击元素表单相关的方法
        cmsHomePage.clickCustomIcons();
        //加载自定义图标页面
        CMSCustomIconsPage iconsPage = PageFactory.initElements(driver,CMSCustomIconsPage.class);
        iconsPage.scrollToScanIcon();
        sleep(5);

    }

    /*@Test
    @Parameters({"url","username","password"})
    public void toLogin(String url, String username, String password) {
        //打开后台管理系统的登录页面
        driver.get(url);
        //加载登录页面
        CMSLoginPage cmsLoginPage = PageFactory.initElements(driver, CMSLoginPage.class);
        //调用登录方法
        cmsLoginPage.login(username,password);
        sleep(1);
    }*/

    @DataProvider(name = "data")
    public Object[][] data() {
       /* String[][] list = {{"guoya2018","guoya2018","后台管理系统"},{"test","test","后台管理系统"}};*/
        Object[][] list = CSVReader.readCSV("src\\test\\resources\\testng\\ui\\cms\\登录数据.csv");
        return list;
    }

    @Test(dataProvider = "data")
    public void toLogin(String username, String password, String expect) {
        //打开后台管理系统的登录页面
        driver.get("http://blog.gdfengshuo.com/example/work/#/login");
        //加载登录页面
        CMSLoginPage cmsLoginPage = PageFactory.initElements(driver, CMSLoginPage.class);
        //调用登录方法
        cmsLoginPage.login(username,password);
        sleep(1);
        boolean actual = driver.getPageSource().contains(expect);
        //断言
        Assert.assertEquals(actual,true);
    }

}
