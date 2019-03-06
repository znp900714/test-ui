package com.guoyasoft.gyautotest.ui.testCase.cms.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class CMSBaseTablePage extends BaseUI {

    //定位第一行的编辑
    @FindBy(xpath = "(//span[contains(text(),'编辑')])[1]")
    private WebElement edit1;

    //定位第一行的删除
    @FindBy(xpath = "(//span[contains(text(),'删除')])[2]")
    private WebElement delete1;

    //点击元素第一行的编辑的方法
    public void clickEdit1() {
        click(edit1);
    }

    //点击元素第一行的删除的方法
    public void clickDelete1() {
        click(delete1);
    }

}
