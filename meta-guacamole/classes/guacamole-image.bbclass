
# GUACAMOLE_FEATURES controls content of guacamole images
#
# By default we install apps-console-core and task-guacamole-core
#
# Available features (in addition to those form core-image):
#
# - guacamole-restricted: packages with restrictive licensing
# - guacamole-mex: Mex media explorer

PACKAGE_GROUP_guacamole-core       = "task-guacamole-core"
PACKAGE_GROUP_guacamole-mex        = "task-guacamole-mex"
PACKAGE_GROUP_guacamole-restricted = "task-guacamole-restricted"

# The core bits of Guacamole
IMAGE_FEATURES =+ "apps-console-core ssh-server-dropbear guacamole-core"

# Configurable Guacamole features
IMAGE_FEATURES =+ "${GUACAMOLE_FEATURES}"

inherit core-image