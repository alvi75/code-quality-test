def validate_as_prior_version(self, prior):
	"""
	Check that prior is a valid prior version of the current inventory object. The input variable prior is also expected to be an InventoryValidator object and both self and prior inventories are assumed to have been checked for internal consistency. Return error() in the class.
	"""
	if not isinstance(prior, InventoryValidator):
		return error("prior must be an instance of InventoryValidator")
	if self.version != prior.version:
		return error("prior version must match this version")
	if self.name != prior.name:
		return error("prior name must match this name")
	if self.description != prior.description:
		return error("prior description must match this description")
	if self.tags != prior.tags:
		return error("prior tags must match this tags")
	if self.type != prior.type:
		return error("prior type must match this type")
	if self.size != prior.size:
		return error("prior size must match this size")
	if self.path != prior.path:
		return error("prior path must match this path")
	if self.hash != prior.hash:
		return error("prior hash must match this hash")
	if self.created_at != prior.created_at:
		return error("prior created_at must match this created_at")
	if self.updated_at != prior.updated_at:
		return error("prior updated_at must match this updated_at")
	if self.deleted_at != prior.deleted_at:
		return error("prior deleted_at must match this deleted_at")