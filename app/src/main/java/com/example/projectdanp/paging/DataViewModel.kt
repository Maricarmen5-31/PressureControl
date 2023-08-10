package com.example.projectdanp.paging

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.projectdanp.datarepository.DataRepository
import com.example.projectdanp.datos.Data
import kotlinx.coroutines.flow.Flow

class DataViewModel(private val dataRepository: DataRepository) : ViewModel() {

    private val dataList: List<Data> = dataRepository.readDataFromJson()

    val data: Flow<PagingData<Data>> = Pager(PagingConfig(pageSize = 10)) {
        DataPagingSource(dataList)
    }.flow.cachedIn(viewModelScope)
}