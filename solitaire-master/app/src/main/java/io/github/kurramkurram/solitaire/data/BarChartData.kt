package io.github.kurramkurram.solitaire.data

import androidx.room.ColumnInfo

/**
 * 棒グラフ表示データ.
 *
 * @param day 日付
 * @param count 件数
 */
data class BarChartData(
    val day: String,
    @ColumnInfo(name = "count(*)") val count: Int
)
