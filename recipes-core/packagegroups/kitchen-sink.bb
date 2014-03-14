DESCRIPTION = "Ensure everything we want available in the package feed is built!"
LICENSE = "MIT"

inherit packagegroup

# We don't have to cover things which will be explicitly included in images as
# those recipes will be built anyway. This group covers things which might not
# be installed by default but should be available to download.
RDEPENDS_kitchen-sink = " \
	packagegroup-core-ssh-dropbear packagegroup-core-ssh-openssh \
	packagegroup-basic \
	nano emacs vim \
	vsftpd \
	wget curl \
	minicom \
	bash \
	coreutils diffutils findutils patch file sed grep gawk less \
	tar gzip bzip2 xz zip unzip \
	man man-pages texinfo \
	htop iftop iotop \
	iputils \
	"
