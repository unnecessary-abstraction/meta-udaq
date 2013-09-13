SUMMARY = "UDAQ device image for beagleboard."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

################################################################################

IMAGE_INSTALL += "ads1672 tuna"
IMAGE_FEATURES += "package-management"
