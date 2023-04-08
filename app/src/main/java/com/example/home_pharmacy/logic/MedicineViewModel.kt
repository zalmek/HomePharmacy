package com.example.home_pharmacy.logic

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.home_pharmacy.db.Medicine
import com.example.home_pharmacy.db.MedicineRoomDatabase
import com.example.home_pharmacy.db.User


class MedicineViewModel(application: Application): ViewModel() {
    private val medicineRepository: MedicineRepository
    val medicineList: MutableLiveData<List<Medicine>>
    val foundMedicine: MutableLiveData<Medicine>

    init {
        val medicineDb = MedicineRoomDatabase.getInstance(application)
        val medicineDao = medicineDb.medicineDao()
        medicineRepository = MedicineRepository(medicineDao)
        medicineList = medicineRepository.allMedicine
        foundMedicine = medicineRepository.foundMedicine
    }


    fun getAllMedicines() {
        medicineRepository.getAllMedicines()
    }

    fun addMedicine(employee: Medicine) {
        medicineRepository.addMedicine(employee)
        getAllMedicines()
    }
    fun addUser(user: User) {
        medicineRepository.addUser(user)
        getAllUsers()
    }

    fun getAllUsers() {
        medicineRepository.getAllUsers()
    }

    fun updateMedicineDetails(employee: Medicine) {
        medicineRepository.updateMedicineDetails(employee)
        getAllMedicines()
    }
}