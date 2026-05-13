def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Shuffle a given seq with the given FIXED_RANDOM_SEED
	"""
	shuffled = list(seq)
	random.seed(FIXED_RANDOM_SEED)
	random.shuffle(shuffled)
	return shuffled