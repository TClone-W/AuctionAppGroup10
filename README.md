# Hệ thống Đấu giá Trực tuyến (Online Auction System)
**Môn học:** Lập trình Nâng cao (LTNC 2025–2026)  
**Kiến trúc:** Client–Server (Java Socket) + MVC (JavaFX)  
**Ngôn ngữ:** Java 21 LTS | Maven | JUnit 5

---


---

## 🚀 Hướng dẫn chạy trên IntelliJ IDEA
1. Mở IntelliJ IDEA -> **Open** -> Chọn thư mục dự án này.
2. Đợi Maven tải dependencies (JavaFX 21, JUnit 5).
3. **Chạy Server:** Chuột phải vào file `com.auction.network.AuctionServer` -> Chọn **Run 'AuctionServer.main()'**.
4. **Chạy Client:** 
   - Chuột phải vào `com.auction.client.MainApp` -> Chọn **Run 'MainApp.main()'**.
   - Để mở nhiều Client thử nghiệm đồng thời: Vào **Run** -> **Edit Configurations...** -> Chọn `MainApp` -> Bật tùy chọn **"Allow multiple instances"** (Cho phép chạy nhiều tiến trình). Sau đó bấm Run thêm 1-2 lần.
