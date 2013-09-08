package spark.perf

trait PerfTest {
  /** Initialize internal state based on arguments */
  def initialize(args: Array[String])

  /** Get parameters used during the trials. */
  def getParams: Seq[(String, String)]

  /** Create stored or otherwise materialized input data */
  def createInputData()

  /** Runs the test and returns a series of results, along with values of any parameters */
  def run(): Seq[Double]
}
