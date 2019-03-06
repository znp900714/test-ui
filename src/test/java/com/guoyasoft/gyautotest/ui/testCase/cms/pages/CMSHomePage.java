package com.guoyasoft.gyautotest.ui.testCase.cms.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class CMSHomePage extends BaseUI {

    //定位元素基础表格
    @FindBy(xpath = "//li/span[contains(text(),'基础表格')]")
    private WebElement baseTable;

    //定位元素表单相关
    @FindBy(xpath = "//span[contains(text(),'表单相关')]")
    private WebElement relateForm;

    //定位元素基本表单
    @FindBy(xpath = "//li[contains(text(),'基本表单')]")
    private WebElement baseForm;

    //定位元素自定义图标
    @FindBy(xpath = "//li/span[contains(text(),'自定义图标')]")
    private WebElement customIcons;

    //点击元素基础表格的方法
    public void clickBaseTable(){
        click(baseTable);
    }

    //点击元素表单相关的方法
    public void clickRelateForm() {
        click(relateForm);
    }

    //点击元素基本表单的方法
    public void clickBaseForm() {
        click(baseForm);
    }

    //点击元素自定义图标的方法
    public void clickCustomIcons() {
        click(customIcons);
    }

}
