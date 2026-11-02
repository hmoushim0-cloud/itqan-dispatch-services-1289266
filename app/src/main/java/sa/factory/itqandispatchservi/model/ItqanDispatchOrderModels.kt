package sa.factory.itqandispatchservi.model

import kotlinx.serialization.Serializable

@Serializable
data class ItqanDispatchItem(
    val id: String,
    val title: String,
    val description: String,
    val priceSar: String,
    val badge: String = "معتمد"
)

@Serializable
data class ItqanDispatchOrder(
    val requestId: String,
    val items: List<ItqanDispatchItem>,
    val status: String = "ACTIVE"
)
