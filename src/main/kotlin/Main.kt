import com.example.A
import com.example.B

import org.jetbrains.kotlin.psi.KtParameter
import org.jetbrains.kotlin.psi.KtProperty


// Compiles in 1.9.20 but not in 2.0.0-Beta1
fun doesntCompile() {
  val ktParameter: KtParameter = TODO()
  val ktProperty: KtProperty = TODO()
  val list = listOf(ktParameter, ktProperty)
  list.map { it.name }
}

// Compiles both in 1.9.20 and 2.0.0-Beta1
fun compiles() {
  val a = A()
  val b = B()
  val list = listOf(a, b)
  list.map { it.name }
}
