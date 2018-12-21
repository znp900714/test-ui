package com.guoyasoft.gyautotest.ui.testCase.test.guoya1.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya1.pages.GuoYaHome;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya1.pages.GuoYaLogin;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya1.pages.GuoYaTaskCheckInfo;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya1.pages.GuoYaUploadSummaryPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class GuoYaTest extends BaseUI {

    @Test
    public void testGuoYa() {
        //打开果芽登录页面
        driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
        //加载登录页面
        GuoYaLogin guoYaLogin = PageFactory.initElements(driver,GuoYaLogin.class);
        //调用登录方法
        guoYaLogin.login("zhounp","123456");
        //加载果芽主页
        GuoYaHome guoYaHome = PageFactory.initElements(driver,GuoYaHome.class);
        //调用点击作业检查1811A超链接的方法
        guoYaHome.clickTaskCheck_1811A();
        //将driver切换到iframe框中
        guoYaHome.switchToIframe(driver);
        //加载果芽任务检查详细信息页
        GuoYaTaskCheckInfo guoYaTaskCheckInfo = PageFactory.initElements(driver,GuoYaTaskCheckInfo.class);
        //调用操作文本域的方法
        guoYaTaskCheckInfo.operateTextarea("今天天气真好，约三两好友谈天论地");
        //调用点击刷新按钮的方法
        guoYaTaskCheckInfo.clickRefreshBtn();
        //调用点击抽奖按钮的方法的方法
        guoYaTaskCheckInfo.clickLuckDrawBtn(driver);
        //将driver切回到原窗口
        guoYaTaskCheckInfo.switchToWindow(driver);
        //调用点击上传总结1811A超链接的方法
        guoYaHome.clickUploadSummary_1811A();
        //将driver切换到iframe框中
        guoYaHome.switchToIframe(driver);
        //加载上传总结页面
        GuoYaUploadSummaryPage summary = PageFactory.initElements(driver,GuoYaUploadSummaryPage.class);
        //调用操作下拉框的方法
        summary.operateSelect(6);
        sleep(1);
        //调用上传文件的方法
        summary.operateUploadFile("D:\\lian1.jpg");
        sleep(1);
        //调用点击上传总结按钮的方法
        summary.clcikUploadSummaryBtn(driver);
        sleep(30);
    }
}
