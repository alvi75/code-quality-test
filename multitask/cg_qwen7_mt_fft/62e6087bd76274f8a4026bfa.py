def pop_u16(self):
		"""
		Remove the last two elements in self.data and return
		"""
		val = struct.unpack('>H',self.data[-2:])[0]
		self.data = self.data[:-2]
		return val