import io.ktor.server.testing.*
import io.ktor.http.*
import kotlin.test.*
import com.example.module
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class TestRoutingTest {
    @Test
    fun testRootRoute() = testApplication {
        application {
            module()
        }
        val response = client.get("/")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Hello World!", response.bodyAsText())
    }
}