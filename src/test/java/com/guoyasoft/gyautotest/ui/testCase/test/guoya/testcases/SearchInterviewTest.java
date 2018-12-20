package com.guoyasoft.gyautotest.ui.testCase.test.guoya.testcases;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.GuoYaHomePage;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages.InterviewSearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class SearchInterviewTest extends BaseUI {

    @Test
    public void testSearchInterview() {
        //打开果芽首页
        driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
        //加载果芽首页信息类
        GuoYaHomePage guoya = PageFactory.initElements(driver, GuoYaHomePage.class);
        addScreenshot2Allure("打开果芽首页");
        //点击查询面试按钮
        guoya.clickInterviewSearchLink();
        //把当前页面的driver切换到内嵌iframe框中
        guoya.switchToIframe(driver);
        //加载查询面试页面信息类
        InterviewSearchPage interview = PageFactory.initElements(driver, InterviewSearchPage.class);
        addScreenshot2Allure("查询面试页面");
        //调用输入用户名的方法
        interview.userNameInputSendKeys("张继成");
        //调用查询方法
        interview.clickSearchBtn();
        addScreenshot2Allure("查询结果页面展示");
        //线程休息5秒
        sleep(5);
    }
}
