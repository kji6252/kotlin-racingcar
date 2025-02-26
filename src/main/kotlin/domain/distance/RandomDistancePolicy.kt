package domain.distance

import kotlin.random.Random

object RandomDistancePolicy: DistancePolicy {
    override fun isDistance(): Boolean {
        return Random.nextInt(RANDOM_UNTIL_NUMBER) >= RANDOM_DISTANCE_CONDITION_NUMBER
    }
    private const val RANDOM_UNTIL_NUMBER = 10
    private const val RANDOM_DISTANCE_CONDITION_NUMBER = 4
}
