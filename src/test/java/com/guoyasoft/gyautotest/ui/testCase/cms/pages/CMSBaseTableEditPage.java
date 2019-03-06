package com.guoyasoft.gyautotest.ui.testCase.cms.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class CMSBaseTableEditPage extends BaseUI {

    //定位编辑框中的日期标签
    @FindBy(xpath = "//label[contains(text(),'日期')]")
    private WebElement dateLabel;

    //定位编辑框中的日期输入框
    @FindBy(xpath = "//input[@placeholder='选择日期']")
    private WebElement dateInput;

    //定位编辑框中的姓名输入框(这里采用了xpath轴定位)
    @FindBy(xpath = "//label[contains(text(),'姓名')]/following-sibling::div//input")
    private WebElement nameInput;

    //定位编辑框中的地址输入框(这里采用了xpath轴定位)
    @FindBy(xpath = "//label[contains(text(),'地址')]/following-sibling::div//input")
    private WebElement addressInput;

    //定位编辑框中的确定按钮
    @FindBy(xpath = "(//span[contains(text(),'确 定')])[1]")
    private WebElement editSureBtn;

    //定位编辑框提交后弹出提示的信息
    @FindBy(xpath = "//div[@role='alert']/p")
    private WebElement tipsDiv;

    //基础表格页面编辑页面的编辑方法
    public void edit(String date, String name, String address){
        sendKeys(dateInput,date);
        click(dateLabel);
        sleep(1);
        sendKeys(nameInput,name);
        sleep(1);
        sendKeys(addressInput,address);
        sleep(1);
        click(editSureBtn);
    }

    //基础表格页面编辑页面的获取提示弹出的信息的内容的方法
    public String getText() {
        return getText(tipsDiv);
    }
}
