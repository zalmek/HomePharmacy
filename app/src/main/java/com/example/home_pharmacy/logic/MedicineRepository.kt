package com.example.home_pharmacy.logic

import androidx.lifecycle.MutableLiveData
import com.example.home_pharmacy.db.Medicine
import com.example.home_pharmacy.db.MedicineDao
import com.example.home_pharmacy.db.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MedicineRepository(private val medicineDao: MedicineDao) {

    val allMedicine = MutableLiveData<List<Medicine>>()
    val foundMedicine = MutableLiveData<Medicine>()
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    fun getAllMedicines(){
        coroutineScope.launch(Dispatchers.IO){
            medicineDao.getAllMedicine()
        }
    }
    fun getAllUsers(){
        coroutineScope.launch(Dispatchers.IO){
            medicineDao.getAllUsers()
        }
    }

    fun addMedicine(newMedicine: Medicine) {
        coroutineScope.launch(Dispatchers.IO) {
            medicineDao.addMedicine(newMedicine)
        }
    }

    fun updateMedicineDetails(newMedicine: Medicine) {
        coroutineScope.launch(Dispatchers.IO) {
            medicineDao.updateMedicineDetails(newMedicine)
        }
    }

    fun addUser(user: User){
        coroutineScope.launch(Dispatchers.IO) {
            medicineDao.addUser(user)
        }
    }
}