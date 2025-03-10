package ge.chapo.feature4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FeatureViewModel(
    private val repository: FeatureRepository = FeatureRepository(),
    private val complexFeatureProcessor: ComplexFeatureProcessor = ComplexFeatureProcessor()
) : ViewModel() {

    private val _data = MutableLiveData<List<String>>()
    val data: LiveData<List<String>> get() = _data

    init {
        callComplexFuns()
    }

    fun loadData() {
        _data.value = repository.getDummyData()
        repository.getDummyData1()
        repository.getDummyData2()
        repository.getDummyData3()
        repository.getDummyData4()
        repository.getDummyData5()
        repository.getDummyData6()
        repository.getDummyData7()
        repository.getDummyData8()
    }


    fun callComplexFuns() {
        complexFeatureProcessor.complexNestedLoops()
        complexFeatureProcessor.processAllItems()
        complexFeatureProcessor.stringManipulationTask()
        complexFeatureProcessor.findTopNItems(1)

        complexFeatureProcessor.sortItemsByValue()
        complexFeatureProcessor.filterItemsByThreshold(323535)
    }
}
