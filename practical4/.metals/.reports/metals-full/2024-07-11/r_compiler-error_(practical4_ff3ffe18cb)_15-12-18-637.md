file:///D:/UCSC/2Yr%201Sem/FP/practical4/q3.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Program%20Files/Java/jdk-22/lib/src.zip!/java.base/java/lang/String.java

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 419
uri: file:///D:/UCSC/2Yr%201Sem/FP/practical4/q3.scala
text:
```scala
object q3 {
  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String)(format: String => String): String = {
    format(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    names.foreach { name =>
      val formattedName = name m@@
    }    
  }
}

//   def main(args: Array[String]): Unit = {
//     val names = List("Benny", "Niroshan", "Saman", "Kumara")
//     names.foreach { name =>
//       val formattedName = name match {
//         case "Benny" => formatNames(name)(toUpper)
//         case "Niroshan" => formatNames(name) { n =>
//           n.substring(0, 2).toUpperCase + n.substring(2).toLowerCase
//         }
//         case "Saman" => formatNames(name)(toLower)
//         case "Kumara" => formatNames(name) { n =>
//           n.substring(0, 1).toUpperCase + n.substring(1, n.length - 1).toLowerCase + n.substring(n.length - 1).toUpperCase
//         }
//         case _ => name
//       }
//       println(formattedName)
//     }
//   }
// }

```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:204)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:175)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:231)
	java.base/java.nio.file.Path.of(Path.java:148)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:326)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:276)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:109)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Program%20Files/Java/jdk-22/lib/src.zip!/java.base/java/lang/String.java