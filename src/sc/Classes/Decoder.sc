Decoder2D : MultiOutUGen{

	*ar{arg inputArray, order = 1, numberOfOutputs = 3, mul = 1.0, add = 0.0;
		^this.multiNewList(['audio', order, numberOfOutputs] ++ inputArray.asArray).madd(mul,add);
	}

	init {arg ... theInputs;
		inputs = theInputs;
		^this.initOutputs((theInputs[1]*2)+1, rate);
	}
}

Decoder2DIrregular : MultiOutUGen{

	*ar{arg inputArray, order = 1, numberOfOutputs = 3, offset = 0, mul = 1.0, add = 0.0;
		^this.multiNewList(['audio', order, numberOfOutputs, offset] ++ inputArray.asArray).madd(mul,add);
	}

	init {arg ... theInputs;
		inputs = theInputs;
		^this.initOutputs((theInputs[1]*2)+1, rate);
	}
}

Decoder2DBinaural : MultiOutUGen{

	*ar{arg inputArray, order = 1, cropSize = 256, mul = 1.0, add = 0.0;
		^this.multiNewList(['audio', order, cropSize] ++ inputArray.asArray).madd(mul,add);
	}

	init {arg ... theInputs;
		inputs = theInputs;
		^this.initOutputs(2, rate);
	}
}

Decoder3D : MultiOutUGen{

	*ar{arg inputArray, numberOfOutputs = 3, order = 1, mul = 1.0, add = 0.0;
		^this.multiNewList(['audio', order, numberOfOutputs] ++ inputArray.asArray).madd(mul,add);
	}

	init {arg ... theInputs;
		inputs = theInputs;
		^this.initOutputs((theInputs[1]+1) * (theInputs[1]+1), rate);
	}
}

Decoder3DBinaural : MultiOutUGen{

	*ar{arg inputArray, order = 1, cropSize = 256, mul = 1.0, add = 0.0;
		^this.multiNewList(['audio', order, cropSize] ++ inputArray.asArray).madd(mul,add);
	}

	init {arg ... theInputs;
		inputs = theInputs;
		^this.initOutputs((theInputs[1]+1) * (theInputs[1]+1), rate);
	}
}