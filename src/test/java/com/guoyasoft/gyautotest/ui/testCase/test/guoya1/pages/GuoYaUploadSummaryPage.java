package com.guoyasoft.gyautotest.ui.testCase.test.guoya1.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class GuoYaUploadSummaryPage extends BaseUI {

    //定位姓名下拉框
    @FindBy(xpath = "//select[@id='sno']")
    private WebElement nameSelect;

    //定位上传文件输入框
    @FindBy(xpath = "//input[@id='postFild']")
    private WebElement uploadFile;

    //定位上传总结按钮
    @FindBy(xpath = "//input[@id='uploadFileBtn']")
    private WebElement uploadSummaryBtn;

    //给姓名下拉框选择值的方法
    public void operateSelect(int index) {
        Select select = new Select(nameSelect);
        select.selectByIndex(index);
    }

    //给上传文件输入框输入值
    public void operateUploadFile(String filePath) {
        sendKeys(uploadFile,filePath);
    }

    //点击上传总结按钮
    public void clcikUploadSummaryBtn(WebDriver driver) {
        click(uploadSummaryBtn);
        Alert confirm = driver.switchTo().alert();
        sleep(1);
        confirm.accept();

    }
}
