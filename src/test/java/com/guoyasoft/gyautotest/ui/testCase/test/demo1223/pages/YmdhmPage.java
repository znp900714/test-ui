package com.guoyasoft.gyautotest.ui.testCase.test.demo1223.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class YmdhmPage extends BaseUI {

    //定位选择日期时间输入框
    @FindBy(xpath = "//input")
    private WebElement dateSelectInput;

}
