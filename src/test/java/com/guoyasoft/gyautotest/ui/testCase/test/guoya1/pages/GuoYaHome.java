package com.guoyasoft.gyautotest.ui.testCase.test.guoya1.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class GuoYaHome extends BaseUI {

    //定位作业检查1811A超链接
    @FindBy(xpath = "//a[contains(text(),'作业检查1811A')]")
    private WebElement taskCheck_1811A;

    //定位上传总结1811A超链接
    @FindBy(xpath = "//a[contains(text(),'上传总结1811A')]")
    private WebElement uploadSummary_1811A;

    //定位面试查询超链接
    @FindBy(xpath = "//a[contains(text(),'面试查询')]")
    private WebElement interviewSearch;

    //定位上传总结1809B超链接
    @FindBy(xpath = "//a[contains(text(),'上传总结1809B')]")
    private WebElement uploadSummary_1809B;

    //定位作业检查1809B超链接
    @FindBy(xpath = "//a[contains(text(),'作业检查1809B')]")
    private WebElement taskCheck_1809B;

    //定位iframe框
    @FindBy(xpath = "//iframe[@id='iframepage']")
    private WebElement iframe;

    //点击作业检查1811A超链接的方法
    public void clickTaskCheck_1811A() {
        click(taskCheck_1811A);
    }

    //点击上传总结1811A超链接的方法
    public void clickUploadSummary_1811A() {
        click(uploadSummary_1811A);
    }

    //点击面试查询超链接的方法
    public void clickInterviewSearch() {
        click(interviewSearch);
    }

    //点击上传总结1809B超链接的方法
    public void clickUploadSummary_1809B() {
        click(uploadSummary_1809B);
    }

    //点击作业检查1809B超链接的方法
    public void clickTaskCheck_1809B() {
        click(taskCheck_1809B);
    }

    //切换driver到iframe框中去
    public void switchToIframe(WebDriver driver) {
        driver.switchTo().frame(iframe);
    }
}
