package com.guoyasoft.gyautotest.ui.testCase.test.guoya.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class GuoYaHomePage extends BaseUI {

    //课程查询链接
    @FindBy(xpath = "//a[contains(text(),'课程查询')]")
    private WebElement courseSearchLink;

    //面试统计链接
    @FindBy(xpath = "//a[contains(text(),'面试统计')]")
    private WebElement interviewCountLink;

    //查询面试链接
    @FindBy(xpath = "//a[contains(text(),'查询面试')]")
    private WebElement interviewSearchLink;

    //iframe框
    @FindBy(xpath = "//iframe")
    private WebElement iframe;

    //点击课程查询链接的方法
    public void clickCourseSearchLink() {
        click(courseSearchLink);
    }

    //点击面试统计链接的方法
    public void clickInterviewCountLink() {
        click(interviewCountLink);
    }

    //点击查询面试链接的方法
    public void clickInterviewSearchLink() {
        click(interviewSearchLink);
    }

    //切换driver到新的页面iframe框中去
    public void switchToIframe(WebDriver driver){
        driver.switchTo().frame(iframe);
    }

}
