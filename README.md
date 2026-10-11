# Hệ thống Đấu giá Trực tuyến (Online Auction System)
**Môn học:** Lập trình Nâng cao (LTNC 2025–2026)  
**Kiến trúc:** Client–Server (Java Socket) + MVC (JavaFX)  
**Ngôn ngữ:** Java 21 LTS | Maven | JUnit 5

---

## 🎯 Bảng phân bổ điểm đồ án (10 + 1.5đ Thưởng)
1. **Thiết kế lớp & Cây kế thừa (0.5đ):** `Entity` -> `User` (`Bidder`, `Seller`, `Admin`) | `Entity` -> `Item` (`Electronics`, `Art`, `Vehicle`)
2. **Nguyên lý OOP (1.0đ):** Đóng gói (`private/protected`), Kế thừa, Đa hình (`calculateCommissionRate()`, `canPlaceBid()`), Trừu tượng.
3. **Design Patterns (1.0đ):**
   - **Singleton:** `AuctionManager` (Double-Checked Locking, volatile, thread-safe).
   - **Factory Method:** `ItemFactory` tạo đối tượng `Item` theo chuyên mục.
   - **Observer:** `AuctionSubject` & `AuctionObserver` phát tín hiệu realtime khi có bid mới.
4. **Quản lý người dùng & sản phẩm (1.0đ):** CRUD tài khoản & danh mục đấu giá.
5. **Chức năng đấu giá (1.0đ):** Kiểm tra hợp lệ, kết thúc phiên, tự động chốt người chiến thắng.
6. **Xử lý ngoại lệ (1.0đ):** `InvalidBidException`, `AuctionClosedException`, `InsufficientFundsException`.
7. **Concurrency & Thread Safety (1.0đ):** `ReentrantLock` giải quyết triệt để Lost Update và Race Condition.
8. **Realtime Socket Update (0.5đ):** Java Socket Object Serialization `NetworkMessage`.
9. **Kiến trúc Client–Server (0.5đ):** Server phục vụ đa luồng đồng thời qua `ExecutorService`.
10. **MVC JavaFX (0.5đ):** Tách bạch rõ ràng FXML View, Controller và Model Entities.
11. **Maven & Checkstyle (0.5đ):** File `checkstyle.xml` tuân thủ convention.
12. **Unit Test JUnit 5 (0.5đ):** Kiểm thử tự động tỷ lệ bao phủ coverage > 60%.
13. **CI/CD GitHub Actions (0.5đ):** Tự động build và test khi push lên `main`/`dev`.
14. **⭐ Bonus Auto-Bidding (+0.5đ):** Tự động nâng giá theo `PriorityQueue` và ngân sách tối đa.
15. **⭐ Bonus Anti-sniping (+0.5đ):** Tự động gia hạn thêm 60 giây khi có bid vào 30 giây cuối cùng.
16. **⭐ Bonus LineChart (+0.5đ):** Biểu đồ biến động giá trực tiếp trên JavaFX.

---

## 🚀 Hướng dẫn chạy trên IntelliJ IDEA
1. Mở IntelliJ IDEA -> **Open** -> Chọn thư mục dự án này.
2. Đợi Maven tải dependencies (JavaFX 21, JUnit 5).
3. **Chạy Server:** Chuột phải vào file `com.auction.network.AuctionServer` -> Chọn **Run 'AuctionServer.main()'**.
4. **Chạy Client:** 
   - Chuột phải vào `com.auction.client.MainApp` -> Chọn **Run 'MainApp.main()'**.
   - Để mở nhiều Client thử nghiệm đồng thời: Vào **Run** -> **Edit Configurations...** -> Chọn `MainApp` -> Bật tùy chọn **"Allow multiple instances"** (Cho phép chạy nhiều tiến trình). Sau đó bấm Run thêm 1-2 lần.
