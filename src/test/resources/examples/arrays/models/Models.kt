package examples.arrays.models

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.NotNull
import kotlin.Int
import kotlin.Long
import kotlin.collections.List

data class ContainsArrayOfArrays(
    @param:JsonProperty("array_of_arrays")
    @get:JsonProperty("array_of_arrays")
    @get:Valid
    val arrayOfArrays: List<List<Something>>? = null
)

data class Something(
    @param:JsonProperty("some_value")
    @get:JsonProperty("some_value")
    val someValue: Int? = null
)

data class ArraySimpleInLined(
    @param:JsonProperty("quantities")
    @get:JsonProperty("quantities")
    @get:NotNull
    val quantities: List<Long>
)

data class ContainsArrayRef(
    @param:JsonProperty("weight_on_mars")
    @get:JsonProperty("weight_on_mars")
    @get:NotNull
    @get:Valid
    val weightOnMars: List<ArrayRef>
)

data class ArrayRef(
    @param:JsonProperty("grams")
    @get:JsonProperty("grams")
    val grams: Int? = null
)
