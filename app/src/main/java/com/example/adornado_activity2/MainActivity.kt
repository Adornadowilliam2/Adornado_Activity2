package com.example.adornado_activity2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.adornado_activity2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val colors = resources.getStringArray(R.array.spinner_items)

        binding.SpinnerOne.onItemSelectedListener =
            object: AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    //position is an index position
                    when (position) {
                        1 -> {
                            binding.boxColorOne.setCardBackgroundColor(Color.RED)
                        }
                        2 -> {
                            binding.boxColorOne.setCardBackgroundColor(Color.GREEN)
                        }
                        3 -> {
                            binding.boxColorOne.setCardBackgroundColor(Color.BLUE)
                        }
                        else -> {
                            binding.boxColorOne.setCardBackgroundColor(Color.WHITE)
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    //hello
                }
            }

        binding.SpinnerTwo.onItemSelectedListener =
            object: AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    //position is an index position
                    when (position) {
                        1 -> {
                            binding.boxColorTwo.setCardBackgroundColor(Color.RED)
                        }
                        2 -> {
                            binding.boxColorTwo.setCardBackgroundColor(Color.GREEN)
                        }
                        3 -> {
                            binding.boxColorTwo.setCardBackgroundColor(Color.BLUE)
                        }
                        else -> {
                            binding.boxColorTwo.setCardBackgroundColor(Color.WHITE)
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    //hello
                }
            }

        binding.btnResult.setOnClickListener {
            val colorOne = binding.boxColorOne.cardBackgroundColor.defaultColor
            val colorTwo = binding.boxColorTwo.cardBackgroundColor.defaultColor

            val resultColor = when {
                colorOne == Color.RED && colorTwo == Color.RED -> Color.RED
                colorOne == Color.BLUE && colorTwo == Color.BLUE -> Color.BLUE
                colorOne == Color.GREEN && colorTwo == Color.GREEN -> Color.GREEN
                colorOne == Color.RED && colorTwo == Color.BLUE -> Color.MAGENTA
                colorOne == Color.  BLUE && colorTwo == Color.RED -> Color.MAGENTA
                colorOne == Color.BLUE && colorTwo == Color.GREEN -> Color.CYAN
                colorOne == Color.GREEN && colorTwo == Color.BLUE -> Color.CYAN
                colorOne == Color.RED && colorTwo == Color.GREEN -> Color.YELLOW
                colorOne == Color.GREEN && colorTwo == Color.RED -> Color.YELLOW
                else -> Color.WHITE
            }

            binding.boxMix.setCardBackgroundColor(resultColor)
        }
    }
}
