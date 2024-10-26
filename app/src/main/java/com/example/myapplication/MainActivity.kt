package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        // Sample data
        val emails = listOf(
            EmailItem(
                initial = "E",
                sender = "Edurila.com",
                subject = "$19 Chỉ dành cho 10 người đầu tiên - Khóa học bán chạy...",
                preview = "Bạn có muốn học thiết kế web không?...",
                time = "12:34 PM",
                isStarred = true,
                backgroundColor = Color.parseColor("#4285F4")
            ),
            EmailItem(
                initial = "C",
                sender = "Chris Abad",
                subject = "Giúp cải thiện Campaign Monitor",
                preview = "Hãy cho chúng tôi biết suy nghĩ của bạn...",
                time = "11:22 AM",
                isStarred = true,
                backgroundColor = Color.parseColor("#EA4335")
            ),
            EmailItem(
                initial = "T",
                sender = "Tuto.com",
                subject = "8 giờ học miễn phí và các bài học mới...",
                preview = "Photoshop, SEO, Blender, CSS, WordPress...",
                time = "11:04 AM",
                isStarred = true,
                backgroundColor = Color.parseColor("#34A853")
            ),
            EmailItem(
                initial = "A",
                sender = "Apple News",
                subject = "Tin tức buổi sáng của bạn",
                preview = "Những thông tin nổi bật ngày hôm nay...",
                time = "10:30 AM",
                isStarred = false,
                backgroundColor = Color.parseColor("#FFAB00")
            ),
            EmailItem(
                initial = "L",
                sender = "LinkedIn",
                subject = "Ai đó vừa xem hồ sơ của bạn",
                preview = "Xem ai quan tâm đến bạn trên LinkedIn...",
                time = "9:15 AM",
                isStarred = true,
                backgroundColor = Color.parseColor("#0A66C2")
            ),
            EmailItem(
                initial = "U",
                sender = "Udemy",
                subject = "Giảm giá đến 90% cho các khóa học",
                preview = "Nhanh tay, ưu đãi chỉ trong hôm nay...",
                time = "8:50 AM",
                isStarred = false,
                backgroundColor = Color.parseColor("#A435F0")
            ),
            EmailItem(
                initial = "F",
                sender = "Facebook",
                subject = "Thông báo về bài đăng mới",
                preview = "Bạn bè của bạn vừa chia sẻ một bài viết...",
                time = "8:20 AM",
                isStarred = true,
                backgroundColor = Color.parseColor("#1877F2")
            ),
            EmailItem(
                initial = "G",
                sender = "Google",
                subject = "Nhận xét mới về tài liệu của bạn",
                preview = "Ai đó đã bình luận trên tài liệu của bạn...",
                time = "7:30 AM",
                isStarred = false,
                backgroundColor = Color.parseColor("#DB4437")
            ),
            EmailItem(
                initial = "A",
                sender = "Amazon",
                subject = "Đơn hàng của bạn đang được giao",
                preview = "Gói hàng của bạn sẽ đến vào ngày mai...",
                time = "7:00 AM",
                isStarred = false,
                backgroundColor = Color.parseColor("#FF9900")
            ),
            EmailItem(
                initial = "S",
                sender = "Spotify",
                subject = "Bài hát nổi bật tuần này",
                preview = "Nghe ngay các bài hát hot nhất...",
                time = "6:45 AM",
                isStarred = true,
                backgroundColor = Color.parseColor("#1DB954")
            )
        )

        listView.adapter = EmailAdapter(this, emails)
    }
}