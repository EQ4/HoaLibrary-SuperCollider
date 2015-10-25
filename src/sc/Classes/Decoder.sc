Decoder2D : MultiOutUGen{

	*ar{arg inputArray, order = 1, numberOfOutputs = 3, mul = 1.0, add = 0.0;
		^this.multiNewList(['audio', order, numberOfOutputs] ++ inputArray.asArray).madd(mul,add);
	}
	*kr{arg inputArray, order = 1, numberOfOutputs = 3, mul = 1.0, add = 0.0;
		^this.multiNewList(['control', order, numberOfOutputs] ++ inputArray.asArray).madd(mul,add);
	}

	init {arg ... theInputs;
		inputs = theInputs;
		^this.initOutputs((theInputs[1]*2)+1, rate);
	}
}