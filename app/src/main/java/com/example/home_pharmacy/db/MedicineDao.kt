package com.example.home_pharmacy.db

import androidx.room.*

@Dao
interface MedicineDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addMedicine(medicine: Medicine)

    @Query("SELECT * FROM medicines WHERE uuid = :medicineId")
    fun findMedicineById(medicineId: String): Medicine

    @Query("SELECT * FROM medicines")
    fun getAllMedicine(): List<Medicine>

    @Update
    suspend fun updateMedicineDetails(medicine: Medicine)

    @Delete
    suspend fun deleteMedicine(medicine: Medicine)
}