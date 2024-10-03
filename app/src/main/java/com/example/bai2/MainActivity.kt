package com.example.bai2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var buttonSave: Button
    private lateinit var buttonCancel: Button
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ánh xạ các thành phần từ layout
        editTextName = findViewById(R.id.nameEditText)
        buttonSave = findViewById(R.id.saveButton)
        buttonCancel = findViewById(R.id.cancelbutton)
        button1 = findViewById(R.id.button1)  // Nút 1
        button2 = findViewById(R.id.button2)  // Nút 2
        button3 = findViewById(R.id.button3)  // Nút 3

        // Xử lý sự kiện cho Nút 1
        button1.setOnClickListener {
            Toast.makeText(this, "Bạn đã nhấn Nút 1", Toast.LENGTH_SHORT).show()
        }

        // Xử lý sự kiện cho Nút 2
        button2.setOnClickListener {
            Toast.makeText(this, "Bạn đã nhấn Nút 2", Toast.LENGTH_SHORT).show()
        }

        // Xử lý sự kiện cho Nút 3
        button3.setOnClickListener {
            Toast.makeText(this, "Bạn đã nhấn Nút 3", Toast.LENGTH_SHORT).show()
        }

        // Xử lý sự kiện khi nhấn nút "Lưu"
        buttonSave.setOnClickListener {
            val enteredName = editTextName.text.toString()
            if (enteredName.isNotEmpty()) {
                Toast.makeText(this, "Tên đã lưu: $enteredName", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Vui lòng nhập tên", Toast.LENGTH_SHORT).show()
            }
        }

        // Xử lý sự kiện khi nhấn nút "Hủy"
        buttonCancel.setOnClickListener {
            editTextName.text.clear()
            Toast.makeText(this, "Đã xóa tên", Toast.LENGTH_SHORT).show()
        }
    }
}
