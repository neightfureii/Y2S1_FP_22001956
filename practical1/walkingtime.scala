object walkingtime {
	def main(args:Array[String]) {
		def easypacetime(distance:Double) = distance * 8
		def tempotime(distance: Double) = distance * 7
		val totalrunningtime = easypacetime(2) + tempotime(3) + easypacetime(2)

		println(totalrunningtime)
	}
}
