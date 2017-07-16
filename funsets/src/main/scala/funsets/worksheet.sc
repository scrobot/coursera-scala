import funsets.FunSets
import funsets.FunSets.singletonSet

val s1 = singletonSet(1)
val s2 = singletonSet(2)
val s3 = singletonSet(3)
val s4 = FunSets.union(s1, s3)
val s5 = FunSets.map(s1, x => x * 2)
FunSets.printSet(s5)