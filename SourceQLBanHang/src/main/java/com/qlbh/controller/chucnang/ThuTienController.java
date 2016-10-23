package com.qlbh.controller.chucnang;

import com.qlbh.render.combobox.DateOption;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class ThuTienController {
	@FXML
	ComboBox<DateOption> cbxTuyChonNgay;
	@FXML
	DatePicker dateNgayBatDau, dateNgayKetThuc;
	@FXML
	public void initialize() {
		cbxTuyChonNgay.setItems(DateOption.getDateOptions());
		cbxTuyChonNgay.getSelectionModel().select(0);
	}
	@FXML
    void onSelectedItemChange(ActionEvent event) {
		System.out.println("DateOption change");
    }
	private void setDatePeriod() {
		
	}
	@FXML
	void onButtonDSPhieuThuClick(ActionEvent event) {
		
	}
	@FXML
	void onButtonDSPhieuCongNoClick(ActionEvent event) {
		
	}
	@FXML
	void onButtonDSPhieuTraNgayClick(ActionEvent event) {
		
	}
	@FXML
	void onButtonTheoDoiCongNoClick(ActionEvent event) {
		
	}
	@FXML
	void onButtonTongHopCongNoClick(ActionEvent event) {
		
	}
	@FXML
	void onButtonXemClick(ActionEvent event) {
		
	}
	@FXML
	void onButtonLapPhieuThuClick(ActionEvent event) {
		
	}
	@FXML
	void onButtonExitClick(ActionEvent event) {
		
	}
}
