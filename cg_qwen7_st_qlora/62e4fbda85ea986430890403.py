def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	Shuffle a given seq with the given FIXED_RANDOM_SEED
	"""
	shuffler = random.Random(FIXED_RANDOM_SEED)
	return shuffler.sample(seq, len(seq))