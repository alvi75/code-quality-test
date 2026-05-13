def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Shuffle a given seq with the given FIXED_RANDOM_SEED
	"""
	random.seed(FIXED_RANDOM_SEED)
	shuffled = random.sample(seq, len(seq))
	return shuffled