def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Shuffle a given seq with the given FIXED_RANDOM_SEED
	"""
	shuffled = list(seq)
	FIXED_RANDOM_SEED.shuffle(shuffled)
	return shuffled