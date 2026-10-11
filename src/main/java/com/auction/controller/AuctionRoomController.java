package com.auction.controller;

import com.auction.model.entity.BidTransaction;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;

public class AuctionRoomController {

    @FXML private Label lblUserInfo;
    @FXML private Button btnSwitchRole;
    @FXML private Label lblItemTitle;
    @FXML private Label lblCategorySpecs;
    @FXML private Label lblCurrentPrice;
    @FXML private Label lblTimer;
    @FXML private Label lblTopBidder;
    @FXML private TextField txtBidAmount;
    @FXML private Button btnPlaceBid;
    @FXML private TextField txtMaxBid;
    @FXML private TextField txtIncrement;

    // Biểu đồ giá Realtime (LineChart)
    @FXML private LineChart<String, Number> chartBidHistory;

    // Bảng lịch sử đặt giá
    @FXML private TableView<BidTransaction> tableBids;
    @FXML private TableColumn<BidTransaction, String> colBidder;
    @FXML private TableColumn<BidTransaction, Double> colAmount;
    @FXML private TableColumn<BidTransaction, String> colTime;

    private final ObservableList<BidTransaction> bidList = FXCollections.observableArrayList();
    private XYChart.Series<String, Number> priceSeries;

    @FXML
    public void initialize() {
        // Khởi tạo Series cho biểu đồ LineChart
        priceSeries = new XYChart.Series<>();
        priceSeries.setName("Biến động giá");
        chartBidHistory.getData().add(priceSeries);

        // Map các cột của bảng với thuộc tính của BidTransaction
        if (colBidder != null) colBidder.setCellValueFactory(new PropertyValueFactory<>("bidderName"));
        if (colAmount != null) colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        if (colTime != null) colTime.setCellValueFactory(new PropertyValueFactory<>("timestamp"));
        if (tableBids != null) tableBids.setItems(bidList);

        // Điểm dữ liệu demo khởi điểm
        priceSeries.getData().add(new XYChart.Data<>("00:00", 3000));
    }

    // Các hàm xử lý sự kiện nút bấm trên FXML
    @FXML
    public void handlePlaceBid() {
        System.out.println("Đã bấm Đặt giá: " + (txtBidAmount != null ? txtBidAmount.getText() : ""));
    }

    @FXML
    public void handleQuickBid50() {
        System.out.println("Bấm +$50");
    }

    @FXML
    public void handleQuickBid100() {
        System.out.println("Bấm +$100");
    }

    @FXML
    public void handleQuickBid250() {
        System.out.println("Bấm +$250");
    }

    @FXML
    public void handleActivateAutoBid() {
        System.out.println("Bật Auto-Bid");
    }

    @FXML
    public void handleSwitchRole() {
        System.out.println("Đổi tài khoản");
    }
}