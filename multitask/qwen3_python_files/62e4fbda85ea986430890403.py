def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	def _shuffled(seq: Sequence[str]) -> list[str]:
	"""
	global FIXED_RANDOM_SEED
	if FIXED_RANDOM_SEED is not None:
		random.seed(FIXED_RANDOM_SEED)
	return random.sample(seq, len(seq))