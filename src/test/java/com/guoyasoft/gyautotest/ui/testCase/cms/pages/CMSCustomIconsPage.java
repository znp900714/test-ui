package com.guoyasoft.gyautotest.ui.testCase.cms.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class CMSCustomIconsPage extends BaseUI {

    //定位元素scan图标
    @FindBy(xpath = "//span[contains(text(),'scan')]")
    private WebElement scanIcon;

    //滚动窗口到元素scan图标出现
    public void scrollToScanIcon() {
        scrollToElement(scanIcon);
    }
}
