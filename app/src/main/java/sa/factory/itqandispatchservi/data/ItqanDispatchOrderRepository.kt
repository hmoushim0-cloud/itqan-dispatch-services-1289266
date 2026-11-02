package sa.factory.itqandispatchservi.data

import sa.factory.itqandispatchservi.model.ItqanDispatchItem
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ItqanDispatchOrderRepository {
    private val _catalog = MutableStateFlow(listOf(
        ItqanDispatchItem("1", "الباقة التنفيذية المعتمدة", "تكامل مباشر مع Mada Contactless EMV L2 NFC + GPS Dispatch", "180 ر.س", "معتمد"),
        ItqanDispatchItem("2", "خدمة المعالجة الفورية", "أداء أصيل بسرعة 60 إطار في الثانية", "95 ر.س", "فوري"),
        ItqanDispatchItem("3", "باقة الصيانة والدعم السحابي", "تشفير كامل للبيانات المحلية ومزامنة آمنة", "250 ر.س", "شامل")
    ))
    val catalog: Flow<List<ItqanDispatchItem>> = _catalog.asStateFlow()
}
