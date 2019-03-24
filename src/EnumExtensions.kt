import java.lang.IllegalArgumentException

/**
 * [name] 에 해당하는 enum 값을 찾거나 없으면 null을 리턴한다.
 * @param name 찾을 enum 명
 */
inline fun <reified E: Enum<E>> enumValueOfOrNull(name: String?): E? {
    return try {
        enumValueOf<E>(name!!)
    } catch (e: IllegalArgumentException) {
        null
    } catch (e: NullPointerException) {
        null
    }
}
