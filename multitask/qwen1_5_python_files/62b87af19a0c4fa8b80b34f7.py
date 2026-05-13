def difference(d1, d2, level=-1):
	"""
	Return a dictionary with items from d1 not contained in d2.
	"""
	if isinstance(d1, dict) and isinstance(d2, dict):
		for k, v in d1.items():
			if k not in d2:
				yield (k, v)
	elif isinstance(d1, list) and isinstance(d2, list):
		for i in range(len(d1)):
			if i >= len(d2):
				break
			d1i = d1[i]
			d2i = d2[i]
			if isinstance(d1i, dict) and isinstance(d2i, dict):
				for kk, vv in difference(d1i, d2i, level=level+1).items():
					yield (kk, vv)
			elif isinstance(d1i, list) and isinstance(d2i, list):
				for j in range(len(d1i)):
					if j >= len(d2i):
						break
					d1ii = d1i[j]
					d2ii = d2i[j]
					if isinstance(d1ii, dict) and isinstance(d2ii, dict):
						for kkk, vvv in difference(d1ii, d2ii, level=level+1).items():
							yield (kkk, vvv)
					elif isinstance(d1ii, list) and isinstance(d2ii, list):
						for jj in range(len(d1ii)):
							if jj >= len(d2ii):
								break
							d1iii = d1ii[jj]
							d2iii = d2ii[jj]
							if isinstance(d1iii, dict) and isinstance(d2iii, dict):
								for kkk, vvv in difference(d1iii, d2iii, level=level+1).items():
									yield (kkk, vvv)
							elif isinstance(d1iii, list) and isinstance(d2iii, list):
								for jjj in range(len(d1iii)):
									if jjj >= len(d2iii):
										break
									d1iiii = d1iii[jj]
									d2iiii = d2iii[jj]
									if isinstance(d1iiii, dict) and isinstance(d2iiii, dict):
										for kkk, vvv in difference(d1iiii, d2iiii, level=level+1).items():
											yield (kkk, vvv)
									elif isinstance(d1ii