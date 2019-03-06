package com.guoyasoft.gyautotest.ui.testCase.cms.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author LENOVO
 * @Version 1.0
 **/
public class CMSBaseFormPage extends BaseUI {

    //定位元素表单名称
    @FindBy(xpath = "//label[contains(text(),'表单名称')]/following-sibling::div//input")
    private WebElement formNameInput;

    //定位元素选择器
    @FindBy(xpath = "//label[contains(text(),'选择器')]/following-sibling::div//span/span")
    private WebElement selectorInput;

    //定位元素选择器中的元素步步高
    @FindBy(xpath = "//li/span[contains(text(),'步步高')]")
    private WebElement selectorOptionBuBuGao;

    //定位元素选择器中的元素小天才
    @FindBy(xpath = "//li/span[contains(text(),'小天才')]")
    private WebElement selectorOptionXiaoTianCai;

    //定位元素选择器中的元素imoo
    @FindBy(xpath = "//li/span[contains(text(),'imoo')]")
    private WebElement selectorOptionImoo;

    //定位元素日期输入框
    @FindBy(xpath = "//input[@placeholder='选择日期']")
    private WebElement dateInput;

    //定位元素时间输入框
    @FindBy(xpath = "//input[@placeholder='选择时间']")
    private WebElement timeInput;

    //定位元素日期时间
    @FindBy(xpath = "//label[contains(text(),'日期时间')]")
    private WebElement datetimeLabel;

    //定位元素城市级联输入框
    @FindBy(xpath = "//label[contains(text(),'城市级联')]/following-sibling::div/span")
    private WebElement cityInput;

    //定位元素广东省
    @FindBy(xpath = "//li[contains(text(),'广东省')]")
    private WebElement guangDongProvince;

    //定位元素广州市
    @FindBy(xpath = "//li[contains(text(),'广州市')]")
    private WebElement guangZhouCity;

    //定位元素天河区
    @FindBy(xpath = "//li[contains(text(),'天河区')]")
    private WebElement tianHeArea;

    //定位元素海珠区
    @FindBy(xpath = "//li[contains(text(),'海珠区')]")
    private WebElement haiZhuArea;

    //定位元素东莞市
    @FindBy(xpath = "//li[contains(text(),'东莞市')]")
    private WebElement dongGuanCity;

    //定位元素长安镇
    @FindBy(xpath = "//li[contains(text(),'长安镇')]")
    private WebElement changAnTown;

    //定位元素虎门镇
    @FindBy(xpath = "//li[contains(text(),'虎门镇')]")
    private WebElement huMenTown;

    //定位元素湖南省
    @FindBy(xpath = "//li[contains(text(),'湖南省')]")
    private WebElement huNanProvince;

    //定位元素选择开关
    @FindBy(xpath = "//span[@class='el-switch__core']")
    private WebElement selectorSwitch;

    //定位元素多选框元素步步高
    @FindBy(xpath = "//label[contains(text(),'多选框')]/following-sibling::div//span[contains(text(),'步步高')]")
    private WebElement checkBoxBuBuGao;

    //定位元素多选框元素小天才
    @FindBy(xpath = "//label[contains(text(),'多选框')]/following-sibling::div//span[contains(text(),'小天才')]")
    private WebElement checkBoxXiaoTianCai;

    //定位元素多选框元素imoo
    @FindBy(xpath = "//label[contains(text(),'多选框')]/following-sibling::div//span[contains(text(),'imoo')]")
    private WebElement checkBoxImoo;

    //定位元素单选框元素步步高
    @FindBy(xpath = "//label[contains(text(),'单选框')]/following-sibling::div//span[contains(text(),'步步高')]")
    private WebElement radioBuBuGao;

    //定位元素单选框元素小天才
    @FindBy(xpath = "//label[contains(text(),'单选框')]/following-sibling::div//span[contains(text(),'小天才')]")
    private WebElement radioXiaoTianCai;

    //定位元素单选框元素imoo
    @FindBy(xpath = "//label[contains(text(),'单选框')]/following-sibling::div//span[contains(text(),'imoo')]")
    private WebElement radioImoo;

    //定位元素文本框
    @FindBy(xpath = "//label[contains(text(),'文本框')]/following-sibling::div//textarea")
    private WebElement textArea;

    //定位元素表单提交按钮
    @FindBy(xpath = "//span[contains(text(),'表单提交')]")
    private WebElement submitBtn;


    public void sendkeysFormNameInput(String text) {
        sendKeys(formNameInput,text);
    }

    public void sendkeysSelectorInput() {
        click(selectorInput);
        click(selectorOptionXiaoTianCai);
    }

    public void sendkeysDateInput(String date) {
        sendKeys(dateInput,date);
        click(datetimeLabel);
    }

    public void sendkeysTimeInput(String time) {
        sendKeys(timeInput,time);
        click(datetimeLabel);
    }

    public void sendkeysCityInput(){
        click(cityInput);
        click(guangDongProvince);
        click(guangZhouCity);
        click(haiZhuArea);
    }

}
