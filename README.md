scala-macro-template
====================

Template for getting up and running with macros in no time.

Scala macros must be compiled separately from the code that uses it. This
template contains a subproject for writing macros that the main project then
depends upon.

The build file is based on the one found in the SBT docs here:
http://www.scala-sbt.org/0.13.0/docs/Detailed-Topics/Macro-Projects.html

To compile and run everything, simply use `sbt run`.

Uses scala 2.11.0-M5 without Macro Paradise. Tested with sbt 0.13.0.
