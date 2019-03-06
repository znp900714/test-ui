package com.guoyasoft.gyautotest.ui.testCase.cms.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class CMSBaseTableDeletePage extends BaseUI {

    //定位删除提示框的确定按钮
    @FindBy(xpath = "(//span[contains(text(),'确 定')])[2]")
    private WebElement delSureBtn;

    //定位删除框提交后弹出提示的信息
    @FindBy(xpath = "//div[@role='alert']/p")
    private WebElement tipsDiv;

    //点击删除提示框的确定按钮的方法
    public void clickDelSureBtn(){
        click(delSureBtn);
    }

    //基础表格页面删除页面的获取提示弹出的信息的内容的方法
    public String getText(){
        return getText(tipsDiv);
    }
}
