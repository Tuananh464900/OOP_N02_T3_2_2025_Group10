# Ứng dụng: Xây dựng quản lý kho hàng


📋 Mục lục

Giới thiệu

Thành viên

Ứng dụng

Yêu cầu

Cài đặt--Chạy

Cấu trúc thư mục

Mô tả đối tượng

Ví dụ

Hướng phát triển


✨ Giới thiệu

Đây là ứng dụng Quản lý Kho Hàng được xây dựng theo hướng lập trình hướng đối tượng (OOP), cho phép:

Quản lý sản phẩm (Product)

Quản lý đối tác: khách hàng/nhà cung cấp (Partner)

Giao dịch nhập/xuất (Transaction)

👥 Thành viên

Hồ Tuấn Anh (24100464) – Tuananh464900

🌐 Ứng dụng

Quản lý sản phẩm

Quản lý đối tác

Giao dịch nhập/xuất kho


📆 Yêu cầu

Java 11 hoặc cao hơn

Maven hoặc IDE hỗ trợ (IntelliJ, Visual Studio Code…)

⚙️ Cài đặt & Chạy

git clone https://github.com/Tuananh464900/OOP_N02_T3_2_2025_Group10.git
🗂️ Cấu trúc thư mục

OOP_N02_T3_2_2025_Group1/ ├── src/ │ ├── Product.java │ ├── Partner.java │ ├── Transaction.java ├── Main.java

📚 Mô tả đối tượng

Product: Đại diện cho hàng hóa trong kho

Partner: Người/đơn vị liên quan đến giao dịch (khách hàng, nhà cung cấp…)

 Transaction: Ghi nhận nhập hoặc xuất hàng

📖 Ví dụ

Product product1 = new Product("P001", "Laptop", "Electronics", "Cai", 10, 15000, 18000);

✨ Hướng phát triển

Thêm giao diện GUI

Kết nối cơ sở dữ liệu



