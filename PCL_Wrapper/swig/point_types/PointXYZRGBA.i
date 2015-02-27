%nspace pcl::PointXYZRGBA;

%include <stdint.i>

%{
#include <pcl/point_types.h>
%}

namespace pcl
{
	struct PointXYZRGBA
	{
		PointXYZRGBA ();
		PointXYZRGBA (float _x, float _y, float _z, uint32_t _rgba);
		float x, y, z, data[3];
		uint32_t rgba;
	};
}
